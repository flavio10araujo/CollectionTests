package com.tests.collection.queue.blockingqueue.arrayblockingqueue;

import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class BQProducer extends Thread {

	private final BlockingQueue<String> queue;
	private final String name;
	
	public BQProducer(BlockingQueue<String> queue, String name) {
		this.queue = queue;
		this.name = name;
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				this.queue.put(UUID.randomUUID().toString());
				Thread.sleep(4000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
		}
	}
}

class BQConsumer extends Thread {
	
	private final BlockingQueue<String> queue;
	private final String name;
	
	public BQConsumer(BlockingQueue<String> queue, String name) {
		this.queue = queue;
		this.name = name;
	}

	@Override
	public void run() {
		while (true) {
			try {
				String str = this.queue.take();
				System.out.println(name + "  took: " + str);
				Thread.sleep(3000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
		}
	}
}

public class AMain {
	public static void main(String[] args) {
		int capacity = 5;
		boolean fair = true;
		BlockingQueue<String> queue = new ArrayBlockingQueue<>(capacity, fair);

		new BQProducer(queue, "Producer1").start();
		//new BQProducer(queue, "Producer2").start();
		//new BQProducer(queue, "Producer3").start();
		new BQConsumer(queue, "Consumer1").start();
		new BQConsumer(queue, "Consumer2").start();
	}
}