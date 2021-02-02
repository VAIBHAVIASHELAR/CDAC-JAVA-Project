import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FlatOwnerComponent } from './flat-owner.component';

describe('FlatOwnerComponent', () => {
  let component: FlatOwnerComponent;
  let fixture: ComponentFixture<FlatOwnerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FlatOwnerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FlatOwnerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
