package base;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceHandler implements ItemListener{
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			 //e>String
			String str = (String)e.getItem();
			System.out.println(str + "Áö¿ª");
			
		}

}