package abstract_classes.cities;

public class LosAngeles extends City{

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getAnnualTaxes() {
		double tax = 0.0;
		tax = (population*(growthRate*.5));
		return tax;
	}

}
