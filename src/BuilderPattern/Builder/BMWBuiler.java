package BuilderPattern.Builder;

import java.util.ArrayList;

import BuilderPattern.CarModel.BMWModel;
import BuilderPattern.CarModel.CarModel;

public class BMWBuiler extends CarBuilder{

	private BMWModel bmwModel = new BMWModel();
	
	@Override
	public void setSequece(ArrayList<String> sequence) {
		this.bmwModel.setSequence(sequence);
	}

	@Override
	public CarModel getCarModel() {
		return this.bmwModel;
	}

}
