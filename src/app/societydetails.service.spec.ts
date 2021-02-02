import { TestBed } from '@angular/core/testing';

import { SocietydetailsService } from './societydetails.service';

describe('SocietydetailsService', () => {
  let service: SocietydetailsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SocietydetailsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
