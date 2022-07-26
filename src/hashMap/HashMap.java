package hashMap;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<String, String>  bioData = new java.util.HashMap<>();
        bioData.put("First Name", "Stockholm");
        bioData.put("Last Name", "Chibuzo");
        bioData.put("email", "@tunde");
        bioData.put("Gender", "binary");
        bioData.put("PhoneNumber", "0800123");
        bioData.put("Address", "Lagos");
        bioData.put("Age", "33");
        bioData.put("Marital Status", "married");
        bioData.put("Spouse", "sade");
        bioData.put("Next Of Kin", "Ladi");
        boolean result = bioData.containsKey("First Name");
        System.out.println(bioData.get("PhoneNumber"));
        bioData.replace("Gender", "binary", "prefer to not say");
        System.out.println(bioData.get("Gender"));
        System.out.println(result);
        int size = bioData.size();
        System.out.println(size);
        System.out.println(bioData.get("binary"));

        bioData.replace("Spouse", "Shade");
        System.out.println(bioData.get("Spouse"));



        System.out.println(bioData.get("First Name")+"'s full details are: \n");
        for (Map.Entry item :
                bioData.entrySet()) {
            System.out.println(item.getKey()+ " is "+item.getValue());
        }

        
        
        

    }


}
