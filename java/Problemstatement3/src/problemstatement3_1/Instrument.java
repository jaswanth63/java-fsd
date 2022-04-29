package problemstatement3_1;

abstract class Instrument{

	public abstract void Play();
}

class Piano extends Instrument{

	@Override public void Play(){
		System.out.println("Piano is playing tan tan tan tan");
	}
	}
class Flute extends Instrument{

	@Override public void Play(){
		System.out.println("Flute is playing toot toot toot toot ");
		}
	}
class Guitar extends Instrument{
	@Override public void Play()
	{
		System.out.println("Guitar is playing tin tin tin");
		}
	}
class InstrumentMain{

	public static void main(String args[]){

		Instrument A[] = new Instrument[12];
		for (int i=0; i<12; i++)

		{
			switch (i%3){
			case 0: { A[i] = new Piano(); break; }

			case 1: { A[i] = new Flute(); break; }

			case 2: { A[i] = new Guitar(); break; }
			}
			
		}
			



     for (int j=0; j<12; j++){
	
	System.out.println(" object : " + (j+1));

	A[j].Play();

	if (A[j] instanceof Piano) { System.out.println("Piano"); }

	if (A[j] instanceof Flute) { System.out.println("Flute"); }

	if (A[j] instanceof Guitar) { System.out.println("Guitar"); }
	}
  }
}
