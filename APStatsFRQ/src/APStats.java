import java.util.ArrayList;


public class APStats {

	//postcondition: the award level is computed and returned,
	//    as follows: 0 for no award, 1 for  AP Scholar,
	//    and 2 for AP Scholar with Honor. 
	int yearCounter =0;
	int gradeCounter = 0;
	double gradeSum = 0;
	public int getAwardLevel(APStudent student){
		//Complete this method for part A.
		ArrayList<APExam> examList = student.getExams();
		for(int i = 0; i<examList.size(); i++) {
			APExam currentExam = (APExam)examList.get(i);
			if(currentExam.getGrade() >= 3) {
				gradeCounter++;
				yearCounter += currentExam.getLevel();
			}
			gradeSum += currentExam.getGrade();
		}
		if(yearCounter >= 8 && gradeCounter > 2) {
			if(gradeSum/examList.size() >= 3.25)
				return 2;
		}
		if(yearCounter >= 6)
			return 1;
		return 0;
	}


	//precondition:  list.size() > 0
	//postcondition: returns an array percents of legnth 3;
	//               percents[0], percents[1], and percents[2]
	//               are filled with perecentages of all students 
	//               from the list with no award, APScholars,
	//               and APScholars with Honor, respectfully
	public double[] getStats(ArrayList<APStudent> list)
	{
		int noAwardCounter = 0;
		int APScholarCounter = 0;
		int APScholarHonorCounter = 0;
		int totalStudents = list.size();
		
		double[] results = new double[3];
		
		for(int k=0; k<list.size(); k++) {
			APStats stats = new APStats();
//			System.out.println(stats.getAwardLevel(list.get(k)));
			if(stats.getAwardLevel(list.get(k)) == 2)
				APScholarHonorCounter++;
			else if(stats.getAwardLevel(list.get(k)) == 1)
				APScholarCounter++;
			else if(stats.getAwardLevel(list.get(k)) == 0)
				noAwardCounter++;
		}		
		
		int[] threeVars = {noAwardCounter, APScholarCounter, APScholarHonorCounter};

		for(int i = 0; i<3; i++) {
			results[i] = (double)threeVars[i] / totalStudents;
			results[i] *= 100;
			System.out.println("results: " + " "+ results[i]);
		}
		
		//Complete this method for part B.
		return results;
	}


	// Do not run this until you are sure it works!!!
	public static void runAPStatsAcceptanceTest(){
		(new APStatsProblemTester()).generateCasesAndRun();
	}
	public static void main(String[] args) {
		runAPStatsAcceptanceTest();

	}

}
