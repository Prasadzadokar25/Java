class InvalidAgeException extends Exception{

	InvalidAgeException(String str){
		super(str);
	}

	
}

class Demo{
	void validate(int age) throws InvalidAgeException{

		if(age<0){
			throw new InvalidAgeException("invalid age");
		}
	}
}
class Client{
	public static void main(String args[]){

		Demo obj = new Demo();
		try{
		obj.validate(-2);
		}
		catch(InvalidAgeException e){

			e.printStackTrace();
		}
	}
}
