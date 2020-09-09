package com.mykong.tests;

import org.junit.runner.RunWith; 
import cucumber.junit.Cucumber; 

@RunWith(Cucumber.class) 
@Cucumber.Options(features = {"login.feature"},format = {"json:target/cucumber.json"})

public class RunTests { }
