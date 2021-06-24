package Interfaces;
//interfaces like a commitment, you won't change the public method interface/parameter type (it will affect your other code which using thi class/method)
//in java, multiple inheritances are only available by using the interface, unlike other languages like c++
//noted that implement <-> interface, extend <-> inheritance
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ITelephone timsPhone;
		timsPhone = new DeskPhone(123456);
		timsPhone.powerOn();
		timsPhone.callPhone(123456);
		timsPhone.answer();
		
		timsPhone = new MobilePhone(24565);
		timsPhone.powerOn();
		timsPhone.callPhone(24565);
		timsPhone.answer();
		
	}

}
