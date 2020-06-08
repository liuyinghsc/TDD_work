package com.tdd.test;

import com.tdd.hello.Product;

import java.util.Optional;

public class TDDTest {


    public int getValue(Product product){
//        普通商品
        if (!product.isFlag()){
            if (product.getSellin()>=0){
                if (product.getQuality()>=1&&product.getQuality()<=50){
                    product.setQuality(product.getQuality()-1);
                }
            }else {
                if (product.getQuality()>=1&&product.getQuality()<=50){
                    product.setQuality(product.getQuality()-2);
                }
            }
        }else {
//            特殊商品
            if (product.getSellin()>10){
                if (product.getQuality()>=1&&product.getQuality()<=50){
                    product.setQuality(product.getQuality()-1);
                }
            }else if(product.getSellin()>5&&product.getSellin()<=10){
                if (product.getQuality()>=1&&product.getQuality()<=50){
                    product.setQuality(product.getQuality()+2);
                }
            }
            else if (product.getSellin()>=0&&product.getSellin()<=5){
                if (product.getQuality()>=1&&product.getQuality()<=50){
                    product.setQuality(product.getQuality()+3);
                }
            }else {
                product.setQuality(0);

            }

        }
        return product.getQuality();

    }




}

