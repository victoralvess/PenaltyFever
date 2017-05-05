-injars       ProjetoFutebol.jar 
-outjars      ProjetoFutebol_out.jar
-libraryjars  <java.home>/lib/rt.jar
-printmapping ProjetoFutebol.map 
-optimizationpasses 5 
-overloadaggressively 
-repackageclasses '' 
-allowaccessmodification 
-keep public class br.com.livr.views.boundary.MainWindow { 
      public static void main(java.lang.String[]); 
}

-keep public class com.**