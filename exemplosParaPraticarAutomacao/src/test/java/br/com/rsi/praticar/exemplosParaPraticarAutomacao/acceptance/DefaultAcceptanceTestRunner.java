package br.com.rsi.praticar.exemplosParaPraticarAutomacao.acceptance;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import io.openbdt.cucumber.CucumberWithOpenBdt;

@RunWith(CucumberWithOpenBdt.class)
@CucumberOptions(features = {"src/test/resources/bdd/not-run/souBarato"}, glue = {"br.com.rsi.praticar.exemplosParaPraticarAutomacao.steps.definition"})
public class DefaultAcceptanceTestRunner {}
