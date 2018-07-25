public class twoVal{
	public int base;
	public int remain;
	public int hours;
	public int days;

	public twoVal(int secs){

		if(secs > 86400)
		{
			days = secs/86400;
			secs = secs - (days*86400);
		}
		if(secs > 3600)
		{
			hours = secs/3600;
			secs = secs - (hours*3600);
		}
		if(secs > 60)
		{
			base = secs/60;
			secs = secs - (base*60);
		}

		remain = secs%60;
	}

}