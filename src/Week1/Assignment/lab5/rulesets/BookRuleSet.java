package week1.Assignment.Lab5.rulesets;

import week1.Assignment.Lab5.gui.BookWindow;
import java.awt.Component;

/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places
 * 6. Price must be a number greater than 0.49.
 */
public class BookRuleSet implements RuleSet {
    private BookWindow wind;

    @Override
    public void applyRules(Component ob) throws RuleException {
        wind = (BookWindow) ob;
        nonEmpty();
        isbnNumeric();
        isbnLength10();
        isbnLength13();
        floatPrice();
        priceNumber();
    }

    public void nonEmpty() throws RuleException {
        if (wind.getTitleValue().trim().isEmpty() ||
                wind.getPriceValue().trim().isEmpty() ||
                wind.getIsbnValue().trim().isEmpty()) {
            throw new RuleException("All fields must be non-empty.");
        }
    }

    public void isbnNumeric() throws RuleException {
        String val = wind.getIsbnValue().trim();
        try {
            // Use Long.parseLong to handle 13-digit ISBNs (int would overflow)
            Long.parseLong(val);
            if (val.length() != 10 && val.length() != 13) {
                throw new RuleException("ISBN must be exactly 10 or 13 digits.");
            }
        } catch (NumberFormatException e) {
            throw new RuleException("ISBN must be numeric.");
        }
    }

    public void isbnLength10() throws RuleException {
        String st = wind.getIsbnValue().trim();
        if (st.length() == 10) {
            // FIX: compare to char literals '0' and '1', not int 0 and 1
            if (st.charAt(0) != '0' && st.charAt(0) != '1') {
                throw new RuleException("For a 10-digit ISBN, the first digit must be 0 or 1.");
            }
        }
    }

    public void isbnLength13() throws RuleException {
        String st = wind.getIsbnValue().trim();
        if (st.length() == 13) {
            String prefix = st.substring(0, 3);
            if (!prefix.equals("978") && !prefix.equals("979")) {
                // FIX: corrected the error message (was copy-pasted from isbnLength10)
                throw new RuleException("For a 13-digit ISBN, the first 3 digits must be 978 or 979.");
            }
        }
    }

    public void floatPrice() throws RuleException {
        String fl = wind.getPriceValue().trim();
        try {
            Float.parseFloat(fl);
            if (!fl.matches("\\d+\\.\\d{2}")) {
                throw new RuleException("Price must be a floating point number with exactly two decimal places.");
            }
        } catch (NumberFormatException e) {
            throw new RuleException("Price must be a floating point number.");
        }
    }

    public void priceNumber() throws RuleException {
        String it = wind.getPriceValue().trim();
        try {
            // FIX: use Float.parseFloat (parseInt fails on decimals like "1.99")
            float f = Float.parseFloat(it);
            // FIX: use <= 0.49f (not int comparison), throw RuleException not RuntimeException
            if (f <= 0.49f) {
                throw new RuleException("Price must be greater than 0.49.");
            }
        } catch (NumberFormatException e) {
            throw new RuleException("Price must be a valid number.");
        }
    }
}