package gov.samhsa.acs.c32.wsclient;

import gov.samhsa.schemas.c32service.IC32Service;

import java.util.logging.Logger;

/**
 * This class was generated by Apache CXF 2.6.0 2012-09-06T08:28:05.248-04:00
 * Generated source version: 2.6.0
 * 
 */

@javax.jws.WebService(serviceName = "C32Service", portName = "BasicHttpBinding_IC32Service", targetNamespace = "http://schemas.samhsa.gov/c32service", wsdlLocation = "C32Service.wsdl", endpointInterface = "gov.samhsa.schemas.c32service.IC32Service")
public class IC32ServiceImpl implements IC32Service {

	private static final Logger LOG = Logger.getLogger(IC32ServiceImpl.class
			.getName());

	/*
	 * (non-Javadoc)
	 * 
	 * @see gov.samhsa.schemas.c32service.IC32Service#getC32(java.lang.String
	 * patientId )*
	 */
	@Override
	public java.lang.String getC32(java.lang.String patientId) {
		LOG.info("Executing operation getC32");
		System.out.println(patientId);
		final String returnedC32 = returnedValueOfGetC32;
		try {
			java.lang.String _return = returnedC32;
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	public static String returnedValueOfGetC32 = "";

}
