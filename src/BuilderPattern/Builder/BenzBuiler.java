package BuilderPattern.Builder;

import java.util.ArrayList;

import BuilderPattern.CarModel.BenzModel;
import BuilderPattern.CarModel.CarModel;

/**
 * 
 * @author Grantyuan
 * benZ组装者
 */
public class BenzBuiler extends CarBuilder{

	private BenzModel benzModel = new BenzModel();
	
	@Override
	public void setSequece(ArrayList<String> sequence) {
		this.benzModel.setSequence(sequence);
	}

	@Override
	public CarModel getCarModel() {
		
		return this.benzModel;
	}

}
