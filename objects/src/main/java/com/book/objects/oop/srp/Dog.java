package com.book.objects.oop.srp;

//public class Dog {
//    final static Boolean male = true;
//    final static Boolean female = false;
//    Boolean gender;
//
//    void toUrinate() {
//        if (this.gender == male) {
//            // 한쪽 다리를 들고 소변을 본다.
//        } else {
//            // 뒷다리 두 개를 굽혀 앉은 자세로 소변을 본다.
//        }
//    }
//}

abstract class Dog {
    abstract void toUrinate();
}

class MaleDog extends Dog {
    @Override
    void toUrinate() {
        // 한쪽 다리를 들고 소변을 본다.
    }
}

class FemaleDog extends Dog {
    @Override
    void toUrinate() {
        // 뒷다리 두 개를 굽혀 앉은 자세로 소변을 본다.
    }
}