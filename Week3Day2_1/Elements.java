package Week3Day2_1;

public class Elements extends Button {
	public static void main(String[] args) {
		//Creating objects for all sub classes
		Button bb= new Button();
		CheckBoxButton cc= new CheckBoxButton();
		RadioButton rr= new RadioButton();
		TextField tt= new TextField();
		WebElement web = new WebElement();
		
		//Calling methods of all subclasses
		bb.submit();
		cc.clickCheckButton();
		rr.selectRadioButton();
		//tt.getText();   //I have doubt in this
		web.click();
		web.setText();
		
	}
	

}
