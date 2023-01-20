package it.develhope.component;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private String myComponentName;

    public MyComponent(){
        this.myComponentName = "Vittoria Vassarotti";
        System.out.println("MyComponent constructor has been called!");
    }

    public String getMyComponentName(){
        System.out.println("MyComponent.getMyComponentName() has been called!");
        return myComponentName;
    }
}
