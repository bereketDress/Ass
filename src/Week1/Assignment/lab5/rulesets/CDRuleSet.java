package week1.Assignment.Lab5.rulesets;

import week1.Assignment.Lab5.gui.CDWindow;
import java.awt.Component;

/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Price must be a floating point number with two decimal places
 * 3. Price must be a number greater than 0.49.
 */
public class CDRuleSet implements RuleSet {
    CDWindow cd;

    @Override
    public void applyRules(Component ob) throws RuleException {
        cd = (CDWindow) ob;
        nonEmpty();
        priceWithFloat();
        priceInNumber();
    }

    public void nonEmpty() throws RuleException {
        if (cd.getPriceValue().trim().isEmpty() ||
                cd.getArtistValue().trim().isEmpty() ||
                cd.getTitleValue().trim().isEmpty()) {
            throw new RuleException("All fields must be non-empty.");
        }
    }

    public void priceWithFloat() throws RuleException {
        String val = cd.getPriceValue().trim();
        try {
            Float.parseFloat(val);
            if (!val.matches("\\d+\\.\\d{2}")) {
                throw new RuleException("Price must be a floating point number with exactly two decimal places.");
            }
        } catch (NumberFormatException e) {
            throw new RuleException("Price must be a floating point number.");
        }
    }

    public void priceInNumber() throws RuleException {
        String st = cd.getPriceValue().trim();
        try {
            // FIX: use Float.parseFloat (parseInt fails on decimals like "1.99")
            float f = Float.parseFloat(st);
            // FIX: changed < to <= so 0.49 itself is also rejected
            if (f <= 0.49f) {
                throw new RuleException("Price must be greater than 0.49.");
            }
        } catch (NumberFormatException e) {
            throw new RuleException("Price must be a valid number.");
        }
    }
}