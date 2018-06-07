// Creating Configuration Instance & Passing Hibernate Configuration File
    	
     Configuration configObj = new Configuration().configure("hibernate.cfg.xml");
    	
  // Since Hibernate Version 4.x, Service Registry Is Being Used
    	
    ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(configObj.getProperties()).build(); 
    
  // Creating Hibernate Session Factory Instance
  
    	 SessionFactory factoryObj = configObj.buildSessionFactory(serviceRegistryObj);
       Session session = factoryObj.openSession();
       
       Student sandy = new Student();
       sandy.setId(1001);
       sandy.setName("tony"); 
       sandy.setCollege("mit");
        sandy.setLocation("new york");
       
       session.beginTransaction();
       session.save(sandy);
       session.getTransaction().commit();
