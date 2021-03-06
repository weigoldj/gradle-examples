package com.weigold

import org.gradle.api.Plugin
import org.gradle.api.Project

class QuotePluginExtension {
  String quote = " default "
  String person = " default "
}

class QuotePlugin implements Plugin<Project> {
  void apply(Project project) {
  
  	def qpe = project.extensions.create('quote', QuotePluginExtension)
  	
  	project.task('quoteMe') {
  	  description = "Prints a quote to the screen"
  	  doLast {
  	  	println "${qpe.quote} by ${qpe.person}"
  	  }
  	}
  }
}