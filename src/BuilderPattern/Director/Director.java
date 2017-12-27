package BuilderPattern.Director;

import java.util.ArrayList;

import BuilderPattern.Builder.BMWBuiler;
import BuilderPattern.Builder.BenzBuiler;
import BuilderPattern.CarModel.BMWModel;
import BuilderPattern.CarModel.BenzModel;

public class Director {

	private ArrayList<String> sequence = new ArrayList<String>();
	private BenzBuiler benzBuiler = new BenzBuiler();
	private BMWBuiler bwmBmwBuiler = new BMWBuiler();
	
	/**
	 * 
	 * A级车benz模型：start --> stop
	 */
	public BenzModel getABenzModel(){
		/*	1、清除原来可能存在的顺序,然后设置顺序		*/
		sequence.clear();
		sequence.add("start");
		sequence.add("stop");
		
		/*	2、按照这个顺序设置顺序，然后返回一个A级车benz模型*/
		this.benzBuiler.setSequece(sequence);
		return (BenzModel)this.benzBuiler.getCarModel();
	}
	
	/**
	 * B级车benz模型：engine boom --> start --> stop
	 * 
	 */
	public BenzModel getBBenzModel(){
		/*	1、清除原来可能存在的数据，设置B级benz车顺序	*/
		sequence.clear();
		sequence.add("engine boom");
		sequence.add("start");
		sequence.add("stop");
		
		/*	2、按照这个顺序造一辆这样的车*/
		benzBuiler.setSequece(sequence);
		return (BenzModel)this.benzBuiler.getCarModel();
	}
	
	/**
	 * A级bwm车： alarm --> start --> stop
	 */
	public BMWModel getABWMModel(){
		sequence.clear();
		sequence.add("alarm");
		sequence.add("start");
		sequence.add("stop");
		
		bwmBmwBuiler.setSequece(sequence);
		return (BMWModel)bwmBmwBuiler.getCarModel();
	} 
	
	/**
	 * B级bwm车： start --> stop
	 */
	public BMWModel getBBMWModel(){
		sequence.clear();
		sequence.add("start");
		sequence.add("stop");
		
		bwmBmwBuiler.setSequece(sequence);
		return (BMWModel)bwmBmwBuiler.getCarModel();
	}
	
	/**
	 * Z级bwm车 ：start
	 */
	public BMWModel getZBMWModel(){
		sequence.clear();
		sequence.add("start");
		
		bwmBmwBuiler.setSequece(sequence);
		return (BMWModel)bwmBmwBuiler.getCarModel();
	}
}
