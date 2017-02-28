package com.ibm.airwatch

import com.urbancode.air.AirPluginTool;
import com.ibm.airwatch.AirWatchClient;

final airTool = new AirPluginTool(args[0], args[1])
final props = airTool.getStepProperties()

def baseUrl = props["baseUrl"]
def authToken = props["authToken"]
def userName = props["userName"]
def password = props["password"]
def applicationId = props["applicationId"]
def smartGroupId = props["smartGroup"]

AirWatchClient client = new AirWatchClient(baseUrl,authToken,userName,password)
client.assignGroup(applicationId, smartGroupId)

