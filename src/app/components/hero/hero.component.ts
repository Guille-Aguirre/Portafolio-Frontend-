import { Component, OnInit } from '@angular/core';
import { persona } from 'src/app/model/persona.model';
import { PersonaService } from 'src/app/serve/persona.service';

@Component({
  selector: 'app-hero',
  templateUrl: './hero.component.html',
  styleUrls: ['./hero.component.css']
})
export class HeroComponent implements OnInit{
  persona: persona = new persona("","","");

  constructor(public personaService:PersonaService){}
  
  ngOnInit(): void {
    this.personaService.getPersona().subscribe(data=>{this.persona=data})
  }
}
