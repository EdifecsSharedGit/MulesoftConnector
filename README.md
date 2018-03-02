## Anypoint Connector for Edifecs XEngine Server

The solution is designed for Mulesoft customers who want to perform data validation or other processing of healthcare transactions using Edifecs XEngine Server.
The solution supports the following types of transactions: HIPAA/X12, NCPDP, HL7. 
Custom popular formats are also supported, for example, XML, JSON, Positional Flat Files, CSV, COBOL, IBM Mainframe, and many more.
Integration is performed through the REST API that submits data to the pre-built Edifecs XEngine Server route. A separate license of Edifecs XEngine Server is required.

## Author
Edifecs, Inc.

## Supported Mule runtime versions

Mule 3.8, 3.9.x

## XEngine Server supported versions

Edifecs XEngine Server 8.8.1 and later

##Service or application supported modules

Edifecs XEngine Server REST API. 

## Installation 

1. Download the Edifecs XEngine Server Connector from the latest Anypoint Studio web site and install it.
2. Open Anypoint Studio, click Help, click Install New Software, and then select Anypoint Connectors Update Site. All available connectors are displayed.
3. Select the Edifecs XEngine Server Anypoint Connector and install it.

##Usage

1. Add the connector to the flow pane and connect it to other connectors.
2. Configure the following required settings:

	* The REST URL of the corresponding XEngine Server REST service.
	* A user login and a password for the Basic Authentication of the Edifecs XEServer REST service.
	* An operation to perform (currently, validation is the only available option)
	* Other key-value pairs (URL parameters) if required. 

3. Start the flow and submit your data to the input of the connector. For this, you can use the File, HTTP client, or other components.
4. Verify the processing results.  For this, you can connect an output of the Edifecs XEngine Server Connector to another Mulesoft connector, for example, File, HTTP client, and so on.

## Reporting Issues

We use GitHub:Issues for tracking issues with this connector. You can report new issues at https://github.com/EdifecsSharedGit/MulesoftConnector