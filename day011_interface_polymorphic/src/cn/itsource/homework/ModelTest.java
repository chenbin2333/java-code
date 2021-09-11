package cn.itsource.homework;

public class ModelTest {

	public static void main(String[] args) {
		
		TModel tModel = new TModel();
		tModel.changeClothes();
		tModel.walkThrough();
		
		ADModel adModel = new ADModel();
		adModel.changeClothes();
		adModel.walkThrough();
		
		PlaneModel pModel = new PlaneModel();
		pModel.changeClothes();
		pModel.walkThrough();
		
	}

}
