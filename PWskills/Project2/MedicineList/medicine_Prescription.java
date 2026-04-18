package MedicineList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthLookAndFeel;
import HospitalManagement.entrypoint;

import static HospitalManagement.entrypoint.*;
public class medicine_Prescription {
    public void medicine(){
        Scanner sc=new Scanner(System.in);
        String n=entrypoint.name;
        System.out.println("****************************************************************************************************************************");
        System.out.println("Hello "+n+", We prescribed you medicine according to you health ::");
        System.out.println("1.Fever");
        System.out.println("2.Headache");
        System.out.println("3.Chestpain");
        System.out.println("4.Asthma");
        System.out.println("5.Cancer");
        System.out.println("6.Diabetes");
        System.out.println("7.HeartDiseases");
        System.out.println("8.LungCancer");
        System.out.println("9.HairLoss");
        System.out.println("10.WeightGain");
        System.out.println("****************************************************************************************************************************");
        System.out.println("Choose the Disease :: ");
        String a=sc.nextLine();
        String b="Fever";
        String c="Headache";
        String d="Chestpain";
        String e="Asthma";
        String f="Cancer";
        String g="Diabetes";
        String h="HeartDiseases";
        String i="LungCancer";
        String j="HairLoss";
        String k="WeightGain";
        if(a.equalsIgnoreCase(b)){
            System.out.println("Fever Prescription :: Acetaminophen (Tylenol) and ibuprofen (Advil, Motrin) help reduce fever in children and adults. Sometimes health care providers advise you to use both types of medicine. Take acetaminophen every 4 to 6 hours.");
        }
        else if(a.equalsIgnoreCase(c)){
            System.out.println("Headache Prescription :: Simple pain relievers available without a prescription are usually the first line of treatment for reducing headache pain. These include the drugs aspirin, ibuprofen (Advil, Motrin IB, others) and naproxen sodium (Aleve).");
        }
        else if(a.equalsIgnoreCase(d)){
            System.out.println("ChestPain Prescription :: Chest-wall pain usually lasts only a few days, and aspirin or ibuprofen may help relieve it. (Remember, however, never give aspirin to anyone younger than 20.) A shooting pain that lasts a few seconds or a quick pain at the end of a deep breath is usually not a cause for concern, either.");
        }
        else if(a.equalsIgnoreCase(e)){
            System.out.println("Asthma Prescription :: Inhaled corticosteroids (beclomethasone, budesonide, ciclesonide, fluticasone, mometasone) are the most effective long-term control medications available for people with asthma. Taken as prescribed, they reduce and prevent fluid and excess mucus. The also prevent swelling in the airways.");
        }
        else if(a.equalsIgnoreCase(f)){
            System.out.println("Cancer Prescription :: Cytoxan (chemical name: cyclophosphamide) daunorubicin (brand names: Cerubidine, DaunoXome) Doxil (chemical name: doxorubicin) Ellence (chemical name: epirubicin).");
        }
        else if(a.equalsIgnoreCase(g)){
            System.out.println("Diabetes Prescription :: Metformin is the most common medicine for type 2 diabetes. It can help keep your blood sugar at a healthy level. It comes as tablets you take with or after meals. Common side effects of metformin include feeling or being sick and diarrhoea.");
        }
        else if(a.equalsIgnoreCase(h)){
            System.out.println("HeartDisease Prescription :: Benazepril (Lotensin),Captopril (Capoten),Enalapril (Vasotec),Fosinopril (Monopril),Lisinopril (Prinivil, Zestril),Moexipril (Univasc),Perindopril (Aceon),Quinapril (Accupril)");
        }
        else if(a.equalsIgnoreCase(i)){
            System.out.println("LungCancer Prescription :: The following anti-angiogenic drugs may be options for lung cancer: Bevacizumab (Avastin, Mvasi), in combination with chemotherapy and atezolizumab (Tecentriq), an immunotherapy drug (see below) Ramucirumab (Cyramza), in combination with the chemotherapy drug docetaxel.");
        }
        else if(a.equalsIgnoreCase(j)){
            System.out.println("HairLoss Prescription :: Topical Minoxidil--> Topical minoxidil stops hair from thinning and stimulates new hair growth.  Oral Finasteride--> Oral finasteride is a prescription medication for men who have male pattern hair loss, or androgenetic alopecia.");
        }
        else if(a.equalsIgnoreCase(k)){
            System.out.println("WeightGain Prescription :: Vringra Ultra Pure Weight Gain Capsules-Fast Increase Weight-Health Supplement 60 Caps (60 No) Vringra Ultra Pure Weight Gain capsules have ingredients such as satawari, gokharu, shilajeet and protein elements improve appetite by enhancing the metabolism of the body.");
        }
        else{
            System.out.println("Soory no more information for medicine prescription is available for you.");
        }
        System.out.println("Thanking You for visiting here...");
        System.out.println("****************************************************************************************************************************");
    }
}
