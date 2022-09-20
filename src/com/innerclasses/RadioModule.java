package com.innerclasses;

public class RadioModule {

    //Конструктор
    public RadioModule(){
        System.out.println("Radiomodule initialized");
    }

    //Метод
    public void call(String number){

        //Длина номера телефона
        int length = 10;

        //Локальный класс
        class GSMModule{

            //Свойства класса GSMModule
            private String phoneNumber;
            private int validNumber;

            //Конструктор
            public GSMModule(String phoneNumber){
                this.phoneNumber = phoneNumber;
            }

            public boolean isValid(){
                if (phoneNumber.length() != length){
                    return false;
                } else {
                    try {
                        validNumber = Integer.parseInt(phoneNumber);
                        return true;
                    } catch (NumberFormatException e){
                        return false;
                    }
                }
            }

            public void dialIn(){
                if(isValid()){
                    System.out.println("Calling phone number " + validNumber);
                } else {
                    System.out.println("Phone Number is invalid. Please correct number");
                }
            }
        }

        GSMModule module = new GSMModule(number);
        module.dialIn();
    }
}
