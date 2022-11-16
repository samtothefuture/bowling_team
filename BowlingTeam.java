//chapter 8 practice exercise

public class BowlingTeam
{
	//instance vaariables
	private String teamName;
	private String[] members = new String[4];

	//mutator (setter) method for teamName
	public void setTeamName(String team)
	{
		teamName = team;
	}

	//accessor (getter) method
	public String getTeamName()
	{
		return teamName;
	}

	//mutator (setter) method for array
	public void setMember(int number, String name)
	{
		members[number] = name;
	}

	//accessor (getter) method for array
	public String getMember(int number)
	{
		return members[number];
	}
}