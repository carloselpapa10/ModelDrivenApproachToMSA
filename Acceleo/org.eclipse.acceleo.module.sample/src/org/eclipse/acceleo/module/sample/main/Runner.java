package org.eclipse.acceleo.module.sample.main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;

import micro.MicroPackage;

public class Runner {

	private static String modelFolder = "/media/charlis/Carlos Data/Microservices/runtime-EclipseApplication-2/org.eclipse.acceleo.module.sample/model/";
	private static String outFolder = "/media/charlis/Carlos Data/Microservices/runtime-EclipseApplication-2/org.eclipse.acceleo.module.sample/output/";
	
	public static void main (String[] args) {
		
		File baseFolderFile = new File(modelFolder);
		
		for (File file : baseFolderFile.listFiles()) {
			run(file.getAbsolutePath(), outFolder);
		}
	}
	
	 public static void run(String modelUri, String outputFolder) {
	    	EPackage.Registry.INSTANCE.put(MicroPackage.eNS_URI, MicroPackage.eINSTANCE); 
	    	Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", MicroPackage.eINSTANCE);
	        try {
	            
	                URI modelURI = URI.createFileURI(modelUri);
	                File folder = new File(outputFolder);
	                List<String> arguments = new ArrayList<String>();
	                
	                EventuateAggregateGenerate eventuateAggregateGenerate = new EventuateAggregateGenerate(modelURI, folder, arguments);
	                eventuateAggregateGenerate.doGenerate(new BasicMonitor());
	                
	                ServicemodelGenerate servicemodelGenerate = new ServicemodelGenerate(modelURI, folder, arguments);
	                servicemodelGenerate.doGenerate(new BasicMonitor());
	                
	                PomGenerate pomGenerate = new PomGenerate(modelURI, folder, arguments);
	                pomGenerate.doGenerate(new BasicMonitor());
	                
	                PropertiesGenerate propertiesGenerate = new PropertiesGenerate(modelURI, folder, arguments);
	                propertiesGenerate.doGenerate(new BasicMonitor());
	                
	                ModelGenerate modelGenerate = new ModelGenerate(modelURI, folder, arguments);
	                modelGenerate.doGenerate(new BasicMonitor());
	                
	                ProxyGenerate proxyGenerate = new ProxyGenerate(modelURI, folder, arguments);
	                proxyGenerate.doGenerate(new BasicMonitor());
	                
	                SagaGenerate sagaGenerate = new SagaGenerate(modelURI, folder, arguments);
	                sagaGenerate.doGenerate(new BasicMonitor());
	                
	                DaoGenerate daoGenerate = new DaoGenerate(modelURI, folder, arguments);
	                daoGenerate.doGenerate(new BasicMonitor());
	                
	                ImplGenerate implGenerate = new ImplGenerate(modelURI, folder, arguments);
	                implGenerate.doGenerate(new BasicMonitor());
	                
	                CommandHandlerGenerate commandHandlerGenerate = new CommandHandlerGenerate(modelURI, folder, arguments);
	                commandHandlerGenerate.doGenerate(new BasicMonitor());
	                
	                WebapiGenerate webapiGenerate = new WebapiGenerate(modelURI, folder, arguments);
	                webapiGenerate.doGenerate(new BasicMonitor());
	                
	                ControllerGenerate controllerGenerate = new ControllerGenerate(modelURI, folder, arguments);
	                controllerGenerate.doGenerate(new BasicMonitor());
	                
	                SwaggerGenerate swaggerGenerate = new SwaggerGenerate(modelURI, folder, arguments);
	                swaggerGenerate.doGenerate(new BasicMonitor());
	                
	                EventHandlerGenerate eventHandlerGenerate = new EventHandlerGenerate(modelURI, folder, arguments);
	                eventHandlerGenerate.doGenerate(new BasicMonitor());
	                
	                Generate generator = new Generate(modelURI, folder, arguments);
	                generator.doGenerate(new BasicMonitor());
	                
	                DockerFileGenerate dockerFileGenerate = new DockerFileGenerate(modelURI, folder, arguments);
	                dockerFileGenerate.doGenerate(new BasicMonitor());
	                
	                DockerComposeGenerate dockerComposeGenerate = new DockerComposeGenerate(modelURI, folder, arguments);
	                dockerComposeGenerate.doGenerate(new BasicMonitor());
	                
	                ExtrafileGenerate extrafileGenerate = new ExtrafileGenerate(modelURI, folder, arguments);
	                extrafileGenerate.doGenerate(new BasicMonitor());
	                
	                AdminServerGenerate adminServerGenerate = new AdminServerGenerate(modelURI, folder, arguments);
	                adminServerGenerate.doGenerate(new BasicMonitor());	 
	                
	                System.out.println("The process has finished successfully :-) ");
	                
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
}
