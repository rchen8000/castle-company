package com.castle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CastleBuilder {

	public Map<Integer, Castle> build(List<Integer> land) {

		Map<Integer, Castle> map = new HashMap<>();
		int upLoc = -1;
		int downLoc = -1;
		int loc = 1;
		
		
		if (land.size() > 0) {
			map.put(0, new Castle(land.get(0), PlaceType.BEGIN));
		}

		while (loc < land.size()) {
			if (land.get(loc) > land.get(loc - 1)) {
				upLoc = loc;
			}
			if (land.get(loc) < land.get(loc - 1)) {
				downLoc = loc;
			}

			if (upLoc < downLoc && upLoc > -1 && !map.containsKey(upLoc)) {
				map.put(upLoc, new Castle(land.get(upLoc), PlaceType.PEAK));
			}
			if (upLoc > downLoc && downLoc > -1 && !map.containsKey(downLoc)) {
				map.put(downLoc, new Castle(land.get(downLoc), PlaceType.VALLEY));
			}

			loc++;
		}

		return map;

	}

	public static void main(String[] args) {

		List<Integer> land = new ArrayList<>(Arrays.asList(3,1,4,1,4,4,4,1,1,2));
		
		System.out.print("land:");
		land.stream().forEach(l -> System.out.printf(" %d ", l));
		System.out.println("");
		
		CastleBuilder builder = new CastleBuilder();
		Map<Integer, Castle> castleMap = builder.build(land);
		castleMap.forEach((key, castle) -> System.out.printf("build castle at %s (stretch %d) on land %d \n",
				castle.getPlace(), castle.getStretch(), key));
		System.out.printf("In total %d catstles are built.\n", castleMap.size());
	}

}
