package w18comp1008s2mar13;

import java.util.ArrayList;

/**
 *
 * @author JWright
 */
public class W18COMP1008S2Mar13
{public static void main(String[] args)
    {
        Phone phone1 = new Phone("Apple","iPhone X", 12, 256);
        Phone phone2 = new Phone("Samsung","Galaxy S8", 12, 64);
        Phone phone3 = new Phone("Google", "Pixel 2", 12.2, 64);
        
        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(phone1);
        phones.add(phone2);
        phones.add(phone3);
        
        System.out.printf("phone1: %s%n", phone1);
        System.out.printf("phone1's camera is %.1f MP%n", phone1.getResolution());
        
        System.out.printf("phone2: %s%n", phone2);
        System.out.printf("phone2's camera is %.1f MP%n", phone2.getResolution());        
        
        System.out.printf("%nThe phone with the highest resolution is: %s,%nit has a %.1f MP camera.%n%n", getHighestResolution(phones), getHighestResolution(phones).getResolution());        
        
        try{
            Phone phone4 = new Phone("JDub","Slick phone 12", 48, 256);
            System.err.println("Missing validation on the brand");
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("If it's an invalid make, the message is: %s%n",e.getMessage());
        }
        
        try{
            Phone phone5 = new Phone("HTC", "Any phone", -2, 64);
            System.err.println("Missing validation on the resolution");
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("If it's an invalid resolution, the message is: %s%n",e.getMessage());
        }
        
        try{
            Phone phone5 = new Phone("HTC", "Any phone", 100, 64);
            System.err.println("Missing validation on the resolution");
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("If it's an invalid resolution, the message is: %s%n",e.getMessage());
        }
        
        try{
            Phone phone6 = new Phone("HTC", "Any phone", 12, 1000);
            System.err.println("Missing validation on the memory");
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("If it's an invalid memory amount, the message is: %s%n",e.getMessage());
        }
    }
    
    
    /**
     * Question 5 - In the space below, write a method that receives an Array of Phone objects as an argument.
     * and returns the Phone with the highest resolution.
     */
     public static Phone getHighestResolution(ArrayList<Phone> phones)
     {
        if (phones.size() > 0)
        {
            //assume the first phone is the highest resolution
            Phone highestResPhone = phones.get(0);
            
            //loop over the phones, comparing each one to the highest resolution phone
            for (Phone phone:phones)
            {
                if (phone.getResolution()>highestResPhone.getResolution())
                    highestResPhone = phone;
            }
            return highestResPhone;
        }
        else
            return null;
     }
   
    
}