package Async;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
//
//public class WhyNotFuture {
//	
//	public static void main(String[] args) throws InterruptedException, ExecutionException {
//		
////		ExecutorService service=Executors.newFixedThreadPool(10);
////		Future<List<Integer>> future = service.submit(()->{
////			
////			//ypu're doing some api call
////			System.out.println("thread"+ Thread.currentThread().getName());
////			delay(1);
////			return Arrays.asList(1,4,5,6,7);
////		});
////		
////		List<Integer> list = future.get();
////		System.out.println(list);
//		
//		
//	}
	
//	private static void delay(int min) {
//		
//		try {
//			
//			TimeUnit.MINUTES.sleep(min);
//			
//		} catch (InterruptedException e) {
//			// TODO: handle exception
//			
//			e.printStackTrace();
//		}
//	}

//}