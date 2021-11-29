public class TargetTyping {
    public interface Email{
        String constructEmail(String name);
    }
    //Email mail = (String name) -> name+" @zemosolabs.com";

    public void getEmail(String name , Email email)
    {
        String mail = email.constructEmail(name);
        System.out.println(mail);
    }

    public static void main(String[] args)
    {
        new TargetTyping().getEmail("shivkeshmadasu", (name) ->name+"@zemosolabs.com");
        // { System.out.println(name+"@zemosolabs.com");
            //return name; });
    }
}
