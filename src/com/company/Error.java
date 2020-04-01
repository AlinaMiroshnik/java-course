package com.company;

import java.util.Random;

public class Error {
    public static void main(String [] args ){
        Error main = new Error();
        Random random = new Random();
        int errorNumber = random.nextInt(8);
        System.out.println(errorNumber);
        main.choseError(errorNumber);

    }
    public void choseError(int num){
        switch (num){
            case 1:
                System.out.println(HTTPError.Ok.getError());
                break;
            case 2:
                System.out.println(HTTPError.Created.getError());
                break;
                case 3:
                System.out.println(HTTPError.Accepted.getError());
                break;
                case 4:
                System.out.println(HTTPError.NoContent.getError());
                break;
                case 5:
                System.out.println(HTTPError.PartialContent.getError());
                break;
                case 6:
                System.out.println(HTTPError.MultiStatus.getError());
                break;
                case 7:
                System.out.println(HTTPError.AlreadyReported.getError());
                break;
                case 8:
                System.out.println(HTTPError.IMUsed.getError());
                break;
            default:
                System.out.println("Other error");
        }
    }

}
