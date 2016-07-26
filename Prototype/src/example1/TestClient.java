package example1;

public class TestClient {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		HostingPlanManager manager = new HostingPlanManager();
		HostingPlanKit kit = manager.getHostingPlanKit("Win");
		HostingPlan Plan = kit.getBasicPlan();
		System.out.println(Plan.getFeatures());
		Plan = kit.getPremiumPlan();
		System.out.println(Plan.getFeatures());
	}
}
