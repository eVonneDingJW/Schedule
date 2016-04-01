import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
public class TestSchedule {
	@Test
	public void testFCFS() 
	{Schedule s = new Schedule();
	Work w1 = new Work("work1",10,10);
	Work w2 = new Work("work2",15,5);
	w1.getPriority();
	List<Work> list = new ArrayList<Work>(); 
	list.add(w1);	
	list.add(w2);
	List<Work> list2 = new ArrayList<Work>();
	list2.add(w1);
	list2.add(w2);
	s.FCFS(list);
	assertEquals(list,list2);
}
	@Test
	public void testSJF() 
	{Schedule s = new Schedule();
	Work w1 = new Work("work1",10,10);
	Work w2 = new Work("work2",15,5);
	List<Work> list = new ArrayList<Work>(); 	
	list.add(w1);
	list.add(w2);
	s.SJF(list);
	List<Work> list2 = new ArrayList<Work>();
	list2.add(w1);
	list2.add(w2);
	assertEquals(list,list2);
	}
	@Test
	public void testSortByServiceTime() 
	{Schedule s = new Schedule();
	Work w1 = new Work("work1",10,10);
	Work w2 = new Work("work2",15,5);
	Work w3 = new Work("work3",15,2);
	List<Work> list = new ArrayList<Work>(); 	
	list.add(w1);	
	list.add(w2);
	list.add(w3);
	Schedule.sortByServiceTime(list);
	List<Work> list2 = new ArrayList<Work>();
	list2.add(w3);
	list2.add(w2);
	list2.add(w1);
	
	assertEquals(list,list2);
	}}