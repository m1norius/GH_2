package main;

public class Validator {
	
	public static boolean isValidate(String...num){
		
		for(String parameter: num){
	        try {
	            Integer.parseInt(parameter);
	            if(new Integer(parameter) < 0){
	            	return false;
	            }
	        } catch (Exception e) {
	        	return false;
	        }
		}
		
        return true;
	}
}
