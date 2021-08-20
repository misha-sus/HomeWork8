package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Goods> goodsList = new ArrayList<>();
		goodsList.add(new Goods("Аэрофлот", "эконом", 20));
		goodsList.add(new Goods("Ред вингс", "бизнес", 13));
		goodsList.add(new Goods("Аэрофлот", "эконом", 23));
		goodsList.add(new Goods("S7", "комфорт", 18));
		goodsList.add(new Goods("Победа", "первый", 40));

		sortByWeightToOutput(goodsList);
		System.out.println("===================");
		sortByStringLengthToOutput(goodsList);

	}

	private static void sortByStringLengthToOutput(List<Goods> goodsList) {
//			С помощью лямбды
//				goodsList.sort((o1,o2) -> (o1.getNameCarrier()+o1.getNameFlight()).length()
//				> (o2.getNameCarrier()+o2.getNameFlight()).length()?1:-1);

		Comparator<Goods> pc = new Comparator<Goods>() {
			@Override
			public int compare(Goods o1, Goods o2) {
				if ((o1.getNameCarrier() + o1.getNameFlight()).length()
						> (o2.getNameCarrier() + o2.getNameFlight()).length()) {
					return 1;
				} else if ((o1.getNameCarrier() + o1.getNameFlight()).length()
						< (o2.getNameCarrier() + o2.getNameFlight()).length()) {
					return -1;
				}
				return 0;
			}
		};
		goodsList.sort(pc);
		for (Goods goods : goodsList) System.out.println(goods);

	}


	private static void sortByWeightToOutput(List<Goods> goodsList) {
		goodsList.sort((o1, o2) -> o1.getMaxWeight() > o2.getMaxWeight() ? 1 : -1);
		for (Goods goods : goodsList) {
			System.out.println(goods);
		}
	}
}
