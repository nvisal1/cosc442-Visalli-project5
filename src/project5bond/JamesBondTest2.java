package project5bond;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JamesBondTest2 {

JamesBond bond = new JamesBond(); 
	
@Test
public void testCase00001(){assertFalse(bond.bondRegex( " 00001 " ));}
@Test
public void testCase0001(){assertFalse(bond.bondRegex( " 0001 " ));}
@Test
public void testCase001(){assertFalse(bond.bondRegex( " 001 " ));}
@Test
public void testCase00101(){assertFalse(bond.bondRegex( " 00101 " ));}
@Test
public void testCase0011(){assertFalse(bond.bondRegex( " 0011 " ));}
@Test
public void testCase01(){assertFalse(bond.bondRegex( " 01 " ));}
@Test
public void testCase010001(){assertFalse(bond.bondRegex( " 010001 " ));}
@Test
public void testCase01001(){assertFalse(bond.bondRegex( " 01001 " ));}
@Test
public void testCase0101(){assertFalse(bond.bondRegex( " 0101 " ));}
@Test
public void testCase010101(){assertFalse(bond.bondRegex( " 010101 " ));}
@Test
public void testCase01011(){assertFalse(bond.bondRegex( " 01011 " ));}
@Test
public void testCase011(){assertFalse(bond.bondRegex( " 011 " ));}
@Test
public void testCase01101(){assertFalse(bond.bondRegex( " 01101 " ));}
@Test
public void testCase0111(){assertFalse(bond.bondRegex( " 0111 " ));}
@Test
public void testCase1(){assertFalse(bond.bondRegex( " 1 " ));}
@Test
public void testCase101(){assertFalse(bond.bondRegex( " 101 " ));}
@Test
public void testCase11(){assertFalse(bond.bondRegex( " 11 " ));}


}
