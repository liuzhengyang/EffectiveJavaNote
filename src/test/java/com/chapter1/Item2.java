package com.chapter1;

import org.junit.Test;

/**
 *  遇到多个构造器参数时要考虑用构建器
 *
 *  重叠构造器模式可行，但是当有许多参数的时候，客户端代码会很难编写，并且仍然较难以阅读
 *  还有一种JavaBean模式，创建对象后使用setter方法来设置每个必要的参数，缺点，创建过程中可能处于不一致的状态
 *
 *  Builder模式只在具有很多参数的时候才使用
 *
 *
 *
 * Created by liuzhengyang on 2015/3/17.
 */
public class Item2 {


    @Test
    public void useConstructor(){

    }

    private static class NutritionFacts{
        private final int servingSize;
        private final int servings;
        private final int fat;

        public static class Builder{
            // Required parameters
            private final int servingSize;
            private final int servings;

            // optional parameters - initialized to default values
            private int fat = 0;

            public Builder(int servingSize, int servings){
                this.servingSize = servingSize;
                this.servings = servings;
            }

            public Builder fat(int val){
                this.fat = val;
                return this;
            }

            public NutritionFacts build(){
                return new NutritionFacts(this);
            }

        }


        public NutritionFacts(Builder builder){
            servings = builder.servings;
            servingSize = builder.servingSize;
            fat = builder.fat;
        }

        @Override
        public String toString() {
            return "NutritionFacts{" +
                    "servingSize=" + servingSize +
                    ", servings=" + servings +
                    ", fat=" + fat +
                    '}';
        }
    }


    @Test
    public void useBuilderPattern(){
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(2,3).fat(5).build();
        System.out.println(nutritionFacts);
    }




}


