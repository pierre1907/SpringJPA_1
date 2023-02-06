package sn.ism;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import sn.ism.domaine.*;
import sn.ism.repository.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDdJpa1Application implements CommandLineRunner
{
	@Autowired
	private EmployeRepository emprepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringDdJpa1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		// TODO Auto-generated method stub
		//creerEmploye();
		//listerEmployes();
		//existeOuPas();
		//rechercherUnEmploye();
		//supprimerUnEmploye();
		//memesNoms();
		//memesPrenom();
		//nomContenant();
		nomComme();
	}
	
	public void creerEmploye()
	{
		Employe emp1 = new Employe();
		emp1.setNom("GASS");
		emp1.setPrenom("Ibro");
		emp1.setEmail("ibrogass@gmail.com");
		emp1.setSalaire(850000);
		emprepo.save(emp1);
		
		Employe emp2 = new Employe();
		emp2.setNom("GASS");
		emp2.setPrenom("Fatou");
		emp2.setEmail("fatougass@gmail.com");
		emp2.setSalaire(850000);
		emprepo.save(emp2);
		
		Employe emp3 = new Employe();
		emp3.setNom("DIOP");
		emp3.setPrenom("Ibro");
		emp3.setEmail("ibrodiop@gmail.com");
		emp3.setSalaire(850000);
		emprepo.save(emp3);
	}
	
	public void listerEmployes()
	{
		List<Employe> liste =emprepo.findAll();
		for (Employe x :liste)
		{
			System.out.println("------------------------------");
			System.out.println("Matricule:"+x.getMatr());
			System.out.println("Nom:"+x.getNom());
			System.out.println("Prenom:"+x.getPrenom());
			System.out.println("Email:"+x.getEmail());
			System.out.println("Salaire:"+x.getSalaire());
		}
		
		System.out.println("_____________________________________");
	}
	
	public void existeOuPas()
	
	{
		Integer matr=3;
		boolean trouve = emprepo.existsById(matr);
		if(trouve)
			System.out.println("Employe trouvé");
		else
			System.out.println("Employe non trouvé");
	}
	
	public void rechercherUnEmploye()
	{
		Integer matr=3;
		boolean trouve = emprepo.existsById(matr);
		if(trouve)
		{
			Employe emp = emprepo.findById(matr).get();
			System.out.println("------------------------------");
			System.out.println("Matricule:"+emp.getMatr());
			System.out.println("Nom:"+emp.getNom());
			System.out.println("Prenom:"+emp.getPrenom());
			System.out.println("Email:"+emp.getEmail());
			System.out.println("Salaire:"+emp.getSalaire());
	
		}
		else
			System.out.println("Employe non trouvé");
	}
	
	public void supprimerUnEmploye()
	{
		Integer matr=3;
		boolean trouve = emprepo.existsById(matr);
		if(trouve)
		{
			
			emprepo.deleteById(matr);
		}
		else
			System.out.println("Employe non trouvé");
	}

	public void memesNoms()
	{
		List<Employe> liste =emprepo.findByNom("DIOP");
		if( liste.size()==0)
			System.out.println("La liste est vide, il n'y a pas de resultat");
		else
			for (Employe x :liste)
			{
				System.out.println("------------------------------");
				System.out.println("Matricule:"+x.getMatr());
				System.out.println("Nom:"+x.getNom());
				System.out.println("Prenom:"+x.getPrenom());
				System.out.println("Email:"+x.getEmail());
				System.out.println("Salaire:"+x.getSalaire());
			}
		System.out.println("_____________________________________");
	}


	public void memesPrenom()
	{
		List<Employe> liste =emprepo.findByPrenom("IBRO");
		if( liste.size()==0)
			System.out.println("La liste est vide, il n'y a pas de resultat");
		else
			for (Employe x :liste)
			{
				System.out.println("------------------------------");
				System.out.println("Matricule:"+x.getMatr());
				System.out.println("Nom:"+x.getNom());
				System.out.println("Prenom:"+x.getPrenom());
				System.out.println("Email:"+x.getEmail());
				System.out.println("Salaire:"+x.getSalaire());
			}
		System.out.println("_____________________________________");
	}

	public void memesSalaire()
	{
		List<Employe> liste =emprepo.findBySalaire(850000);
		if( liste.size()==0)
			System.out.println("La liste est vide, il n'y a pas de resultat");
		else
			for (Employe x :liste)
			{
				System.out.println("------------------------------");
				System.out.println("Matricule:"+x.getMatr());
				System.out.println("Nom:"+x.getNom());
				System.out.println("Prenom:"+x.getPrenom());
				System.out.println("Email:"+x.getEmail());
				System.out.println("Salaire:"+x.getSalaire());
			}
		System.out.println("_____________________________________");
	}

	public void salaireSuperieur()
	{
		List<Employe> liste =emprepo.findBySalaireGreaterThan(450000);
		if( liste.size()==0)
			System.out.println("La liste est vide, il n'y a pas de resultat");
		else
			for (Employe x :liste)
			{
				System.out.println("------------------------------");
				System.out.println("Matricule:"+x.getMatr());
				System.out.println("Nom:"+x.getNom());
				System.out.println("Prenom:"+x.getPrenom());
				System.out.println("Email:"+x.getEmail());
				System.out.println("Salaire:"+x.getSalaire());
			}
		System.out.println("_____________________________________");
	}


	public void salaireEntre()
	{
		List<Employe> liste =emprepo.findBySalaireBetween(450000, 600000);
		if( liste.size()==0)
			System.out.println("La liste est vide, il n'y a pas de resultat");
		else
			for (Employe x :liste)
			{
				System.out.println("------------------------------");
				System.out.println("Matricule:"+x.getMatr());
				System.out.println("Nom:"+x.getNom());
				System.out.println("Prenom:"+x.getPrenom());
				System.out.println("Email:"+x.getEmail());
				System.out.println("Salaire:"+x.getSalaire());
			}
		System.out.println("_____________________________________");
	}

	public void nomContenant()
	{
		List<Employe> liste =emprepo.findByNomContaining("k");
		if( liste.size()==0)
			System.out.println("La liste est vide, il n'y a pas de resultat");
		else
			for (Employe x :liste)
			{
				System.out.println("------------------------------");
				System.out.println("Matricule:"+x.getMatr());
				System.out.println("Nom:"+x.getNom());
				System.out.println("Prenom:"+x.getPrenom());
				System.out.println("Email:"+x.getEmail());
				System.out.println("Salaire:"+x.getSalaire());
			}
		System.out.println("_____________________________________");
	}

	public void nomComme()
	{
		List<Employe> liste =emprepo.findByNomLike("%k%");
		if( liste.size()==0)
			System.out.println("La liste est vide, il n'y a pas de resultat");
		else
			for (Employe x :liste)
			{
				System.out.println("------------------------------");
				System.out.println("Matricule:"+x.getMatr());
				System.out.println("Nom:"+x.getNom());
				System.out.println("Prenom:"+x.getPrenom());
				System.out.println("Email:"+x.getEmail());
				System.out.println("Salaire:"+x.getSalaire());
			}
		System.out.println("_____________________________________");
	}

}
