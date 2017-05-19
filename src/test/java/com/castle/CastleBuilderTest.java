package com.castle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

import org.junit.Test;

public class CastleBuilderTest {
	
	@Test
	public void testBuild(){
		
		List<Integer> emptyLand = new ArrayList<>();
		List<Integer> flatLand = new ArrayList<>(Arrays.asList(1,1,1,1,1,1,1));
		List<Integer> stretchLand = new ArrayList<>(Arrays.asList(3,1,4,1,4,4,4,1,1,2));	
		
		CastleBuilder castleBuilder=new CastleBuilder();
		assertTrue(castleBuilder.build(emptyLand).size()==0);
		assertTrue(castleBuilder.build(flatLand).size()==1);
		assertTrue(castleBuilder.build(stretchLand).size()==6);
		
	}

}
