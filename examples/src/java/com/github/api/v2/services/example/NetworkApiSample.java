/*
 * Copyright 2010 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */
package com.github.api.v2.services.example;

import java.util.List;

import com.github.api.v2.schema.NetworkCommit;
import com.github.api.v2.services.GitHubServiceFactory;
import com.github.api.v2.services.NetworkService;

/**
 * The Class NetworkApiSample.
 */
public class NetworkApiSample {

    /**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		GitHubServiceFactory factory = GitHubServiceFactory.newInstance();
		NetworkService service = factory.createNetworkService();
		List<NetworkCommit> commits = service.getNetworkData("facebook", "tornado", "7b80c2f4db226d6fa3a7f3dfa59277da1d642f91");
		for (NetworkCommit commit : commits) {
			printResult(commit);
		}
	}
    
	/**
	 * Prints the result.
	 * 
	 * @param commit
	 *            the commit
	 */
	private static void printResult(NetworkCommit commit) {
		System.out.println(commit);
	}
}
