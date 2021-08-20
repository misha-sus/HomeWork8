package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	  List<Goods> goodsList = new ArrayList<>();
	  goodsList.add(new Goods("Аэрофлот","эконом",20));
	  goodsList.add(new Goods("Ред вингс","бизнес",13));
	  goodsList.add(new Goods("Аэрофлот","эконом",23));
	  goodsList.add(new Goods("S7","комфорт",18));
	  goodsList.add(new Goods("Победа","первый",40));
		goodsList.sort((o1,o2)-> o1.getMaxWeight() > o2.getMaxWeight()?1:-1);
	  for(Goods goods: goodsList){
          System.out.println(goods);
      }
    }
}
