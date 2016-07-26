package example1;
public class HostingPlanKit {
	private HostingPlan basicPlan;
	private HostingPlan premiumPlan;
	private HostingPlan premPlusPlan;

	public HostingPlanKit(HostingPlan basicPlan, HostingPlan premiumPlan, HostingPlan premPlusPlan) {
		this.basicPlan = basicPlan;
		this.premiumPlan = premiumPlan;
		this.premPlusPlan = premPlusPlan;
	}

	public HostingPlan getBasicPlan() {
		return basicPlan;
	}

	public void setBasicPlan(HostingPlan basicPlan) {
		this.basicPlan = basicPlan;
	}

	public HostingPlan getPremiumPlan() {
		return premiumPlan;
	}

	public void setPremiumPlan(HostingPlan premiumPlan) {
		this.premiumPlan = premiumPlan;
	}

	public HostingPlan getPremPlusPlan() {
		return premPlusPlan;
	}

	public void setPremPlusPlan(HostingPlan premPlusPlan) {
		this.premPlusPlan = premPlusPlan;
	}
	

}
