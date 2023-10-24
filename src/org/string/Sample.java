package org.string;

public class Sample {
public static void main(String[] args) {
	
	System.out.println("==================literal string==============");
	String s1= "bharathi";
	String s2 = "Muthu";
	String s3 ="bharathi";
	
	int ns1 = System.identityHashCode(s1);
	System.out.println("bharathi valve :"+ns1);
	
	int ns2 = System.identityHashCode(s2);
	System.out.println("sharathi valve :"+ns2);
	
	int ns3 = System.identityHashCode(s3);
	System.out.println("bharathi valve :"+ns3);
	
	System.out.println("==============non literal string=========");
	
	String st = new String ("Barathi");
	String st1 = new String ("Muthu");
	String st2 = new String ("Barathi");
	
	
	int mst = System.identityHashCode(st);
	System.out.println("Bharathi valuve :"+mst);
	

	int mst1 = System.identityHashCode(st1);
	System.out.println("Muthu valuve :"+mst1);
	
	int mst2 = System.identityHashCode(st2);
	System.out.println("Bharathi valuve :"+mst2);
	
	System.out.println("============immutable string===============");
	
	String bh = "BHarathi ";
	String bh1 ="MUTHU";
	
	String bhs = bh.concat(bh1);
	System.out.println("concat");
	
	int mb = System.identityHashCode(bh);
	System.out.println("mem of bharathi :"+mb);
	
	int mb1 = System.identityHashCode(bh1);
	System.out.println("mem of muthu :"+mb1);
	
	int mconcat = System.identityHashCode(bhs);
	System.out.println("mem of bharathi :"+mconcat);
	
	
	System.out.println("==================mutable string===========");
	
	StringBuilder sr = new StringBuilder("bharathi");
	StringBuilder sr1= new StringBuilder("muthu");
	
	StringBuilder append = sr.append(sr1);
	System.out.println("append");
	
	int ms = System.identityHashCode(sr);
	System.out.println("memory of bharathi:"+ms);
	
	
	int ms1 = System.identityHashCode(sr1);
	System.out.println("memory of muthu:"+ms1);
	
	int mappend = System.identityHashCode(append);
	System.out.println("memory of bharathi:"+mappend);
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
