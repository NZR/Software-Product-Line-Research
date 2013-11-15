package splr.diff;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Timer;

import org.eclipse.emf.ecore.resource.ResourceSet;

public class FeatureModelDiff
{

	/**
	 * @param args
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws IOException,
			InterruptedException, SQLException
	{
		String[] archs = {
					"alpha",
					"arm",
					"arm64",
					"avr32","blackfin","c6x",
						"cris","frv","hexagon","ia64","m32r","m68k",
						"microblaze","mips","mn10300","openrisc","parisc",
						"powerpc","s390","score","sh","sparc","tile","unicore32",
						"xtensa","x86"};
		for(String arch : archs)
		{
			
			long startTime = System.currentTimeMillis();
			
			DiffTool diff = new DiffTool();
			diff.start( arch );
			
			long endTime = System.currentTimeMillis();
			long duration = endTime - startTime;
			System.out.println("Finished extracting data for "+arch+ " ( "+duration/1000+" seconds)");
		}
	}

	public static void compare(String file1, String file2) throws IOException,
			InterruptedException
	{

		DiffEngine model = new DiffEngine();
		model.initModelFromXsd();
		model.setOldModel( file1 );
		model.setNewModel( file2 );
		model.getDiff();

	}

	public static void compare(ResourceSet res1, ResourceSet res2)
			throws IOException, InterruptedException
	{
		DiffEngine model = new DiffEngine();
		model.initModelFromXsd();
		model.setOldModel( res1 );
		model.setNewModel( res2 );
		model.getDiff();
	}
}
