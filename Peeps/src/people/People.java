package people;

public abstract class People 
{
	private int height;
	/**
	 * @return the height
	 */
	
	public int getHeight() 
	{
		return height;
	}
	/**
	 * @param height the height to set
	 */
	
	public void setHeight(int height) 
	{
		this.height = height;
	}
	
	private boolean weight;
	/**
	 * @return the weight
	 */
	
	public boolean isWeight()
	{
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */

	public void setWeight(boolean weight) 
	{
		this.weight = weight;
	}
	private String familyName;
	/**
	 * @return the familyName
	 */
	
	public String getFamilyName() 
	{
		return familyName;
	}
	
	/**
	 * @param familyName the familyName to set
	 */
	public void setFamilyName(String familyName) 
	{
		this.familyName = familyName;
	}
	
}
