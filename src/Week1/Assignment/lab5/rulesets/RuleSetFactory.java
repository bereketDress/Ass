package week1.Assignment.Lab5.rulesets;


import week1.Assignment.Lab5.gui.BookWindow;
import week1.Assignment.Lab5.gui.CDWindow;

import java.awt.Component;
import java.util.HashMap;


final public class RuleSetFactory {
	private RuleSetFactory(){}

	static HashMap<Class<? extends Component>, RuleSet> map = new HashMap<>();
	static{
		map.put(BookWindow.class, new BookRuleSet());//BookWindow.class key && new object is value
		map.put(CDWindow.class, new CDRuleSet());
	}

	/**
	 *return type is ruleSet interface coz factory return either BookRuleSet OR CDRuleSet
	 */
	public static RuleSet getRuleSet(Component comp) {
		return map.get(comp.getClass());
		//getClass return class, comp.getClass return CD/BookWindow.class
		//map.get(CDWindow.class) return CDRuleSet coz CDWindow is key
	}
}
