import { Injectable } from '@angular/core';



@Injectable({
  providedIn: 'root'
})
export class PersonaService {
  URL = 'http://localhost:8080/personas/';

  constructor(private http: HttpClientModule) { }
  
  public getPersona(): Observable<persona>{
    return this.http.get<persona>(this.URL + 'traer/perfil')

  }
}
